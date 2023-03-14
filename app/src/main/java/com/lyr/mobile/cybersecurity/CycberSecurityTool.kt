package com.lyr.mobile.cybersecurity

import java.net.URL
import javax.net.ssl.HttpsURLConnection

class CycberSecurityTool {

    fun UseTLStraffic() {
        val url = URL("https://www.google.com")
        val urlConnection = url.openConnection() as HttpsURLConnection
        // use HttpsURLConnection to create connection
        urlConnection.connect()
        urlConnection.inputStream.use {
        }
    }

}