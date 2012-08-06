package http;

import net.gnim.extend.HttpClient;
import net.gnim.extend.HttpClient.HttpClientResponse;

/**
 *
 * @author ming
 */
public class Http {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HttpClient client = new HttpClient();
        //simple get
        HttpClientResponse resp = client.get("http://baidu.com", null);
        if (resp.code == HttpClientResponse.CODE_OK) {
            echo("Ok:\n" + resp.text);
        } else if (resp.code == HttpClientResponse.CODE_EXPCETION) {
            echo("Exception:\n" + resp.ex.getMessage());
        } else {
            echo("Error:\n" + resp.code);
        }
        
        //simple post
        //client.post("http://baidu.com", param);
        
        //multipart post
        //client.multipartPost("http://baidu.com", param);
        
        //download file
        //client.download(url, path);
        
        //asynchronous simple get
        //client.doGet(listener, "http://baidu.com", param);
        
        //asynchronous simple post
        //client.doPost(listener, "http://baidu.com", param);
        
        //asynchronous multipart post
        //client.doMultipartPost(listener, "http://baidu.com", param);
    }

    public static void echo(String msg) {
        System.out.println(msg);
    }
}
