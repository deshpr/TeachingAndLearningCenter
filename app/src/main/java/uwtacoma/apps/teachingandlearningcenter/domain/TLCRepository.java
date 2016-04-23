package uwtacoma.apps.teachingandlearningcenter.domain;

import android.util.Log;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.util.List;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import org.json.JSONObject;

/**
 * Created by Rahul on 4/18/2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.net.ssl.HttpsURLConnection;

import uwtacoma.apps.teachingandlearningcenter.HomeActivity;
import uwtacoma.apps.teachingandlearningcenter.MainActivity;

public class TLCRepository  implements ITLCRepository {


    private static String getStringContent(InputStream  in) throws java.io.IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuffer buffer = new StringBuffer();
            String line = "";
        while((line = reader.readLine())!=null){
            buffer.append(line);

        }
        Log.d(HomeActivity.DEBUG_TAG, "buffered to = " + buffer.toString());
        return  buffer.toString();
    }

    private  static String base_url = "https://10.16.12.66/MyWebsite/";




    public String getTutors(){
        String urlForRequest =  base_url + "read.php";
        try{
            URL url = new URL(urlForRequest);
            HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            String result = getStringContent(in);
         //   JSONObject jsonResult = new JSONObject(result);
            return result;
        }
        catch(MalformedURLException ex){
   Log.d(HomeActivity.DEBUG_TAG, ex.toString());
        }
        catch(java.io.IOException ex){
            Log.d(HomeActivity.DEBUG_TAG, ex.toString());
        }
//        catch(org.json.JSONException ex){
//
//        }
        return "";
    }

}
