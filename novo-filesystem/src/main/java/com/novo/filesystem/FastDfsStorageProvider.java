package com.novo.filesystem;

import com.novo.filesystem.fastdfs.client.DefaultStorageClient;
import com.novo.filesystem.fastdfs.client.DefaultTrackerClient;
import com.novo.filesystem.fastdfs.client.StorageClient;
import com.novo.filesystem.fastdfs.client.TrackerClient;
import com.novo.filesystem.fastdfs.conn.DefaultCommandExecutor;
import com.novo.filesystem.fastdfs.model.StorePath;
import com.novo.filesystem.fastdfs.pool.ConnectionPool;
import com.novo.filesystem.fastdfs.pool.PooledConnectionFactory;
import com.novo.filesystem.fastdfs.protocol.storage.callback.DownloadCallback;
import com.novo.filesystem.fastdfs.protocol.storage.callback.DownloadFileWriter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class FastDfsStorageProvider implements InitializingBean, DisposableBean{

	private FastDfsStorageProvider FastDfsStorageProvider;
    private static ConnectionPool connectionPool;
    private static StorageClient storageClient;
	String provider;
	String groupName;
	String accessKey;
	String secretKey;
	String urlprefix;
	String servers;
	int connectTimeout = 3000;
	int maxThreads = 50;

	public void setFastDfsStorageProvider(FastDfsStorageProvider FastDfsStorageProvider) {
		this.FastDfsStorageProvider = FastDfsStorageProvider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}




	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public void setUrlprefix(String urlprefix) {
		this.urlprefix = urlprefix;
	}

	public void setServers(String servers) {
		this.servers = servers;
	}
	
	@Override
	public void destroy() throws Exception {
		connectionPool.close();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		   PooledConnectionFactory pooledConnectionFactory = new PooledConnectionFactory(500, connectTimeout);
	        GenericKeyedObjectPoolConfig conf = new GenericKeyedObjectPoolConfig();
	        conf.setMaxTotal(200);
	        conf.setMaxTotalPerKey(200);
	        conf.setMaxIdlePerKey(100);
	        connectionPool = new ConnectionPool(pooledConnectionFactory, conf);
	        Set<String> trackerSet = new HashSet<String>();
	        String[] serversArray = servers.split(",|;");
	        for (String string : serversArray) {
	        	trackerSet.add(string);
			}
	        DefaultCommandExecutor commandExecutor = new DefaultCommandExecutor(trackerSet, connectionPool);
	        TrackerClient trackerClient = new DefaultTrackerClient(commandExecutor);
	        storageClient = new DefaultStorageClient(commandExecutor, trackerClient);
	}
/**
 * 
 * @param fileName 上传文件路径
 * @return
 * @throws IOException
 */
	public String upload(String fileName) throws IOException {
		File file = new File(fileName);
        FileInputStream fileInputStream = FileUtils.openInputStream(file);
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        StorePath storePath = storageClient.uploadFile(this.groupName, fileInputStream, file.length(), suffix);
        fileInputStream.close();
        String url=urlprefix+"/"+storePath.getFullPath();
		return url;
	}

/**
 * 
 * @param fileName 上传文件路径
 * @param inputStream 文件流
 * @param filelength  文件长度
 * @return 总的显示文件路径
 * @throws IOException
 */
	public String upload(String fileName,InputStream inputStream ,long filelength) throws IOException {


        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        StorePath storePath = storageClient.uploadFile(this.groupName, inputStream, filelength, suffix);
        inputStream.close();
        String url=urlprefix+"/"+storePath.getFullPath();
		return url;
	}




	public boolean delete(String fileName) {
		return storageClient.deleteFile(this.groupName, fileName);
	}

	public <T> T downloadFile(String groupName, String path, DownloadCallback<T> callback) {
		return storageClient.downloadFile(groupName, path, callback);
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	/**
	 * 
	 * @param resourcepath 原文件路径
	 * @param targetpath  目标文件路径
	 * @return 显示路径
	 */
    public String downloadFile(String resourcepath,String targetpath) {
      DownloadFileWriter downloadFileWriter = new DownloadFileWriter(targetpath);
      String filePath = storageClient.downloadFile(this.groupName, resourcepath, downloadFileWriter);
      return filePath;
  }
    
    /**
     * 
     * @param fileOffset 初始长度
     * @param fileSize   总长度
     * @param resourcepath  原路径
     * @param targetpath   目标路径
     */
  public void downloadFile(long fileOffset,long fileSize,String resourcepath,String targetpath) {
  DownloadFileWriter downloadFileWriter = new DownloadFileWriter(targetpath);
  String filePath = storageClient.downloadFile(groupName, resourcepath, fileOffset, fileSize, downloadFileWriter);
  }   
    
    

}
