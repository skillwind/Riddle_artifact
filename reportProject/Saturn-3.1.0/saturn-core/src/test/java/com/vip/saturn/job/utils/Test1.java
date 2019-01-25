//package com.vip.saturn.job.utils;
//import java.io.IOException;
//
//import com.vip.saturn.job.exception.SaturnJobException;
//import com.vip.saturn.job.utils.HttpUtils;
//
//public class Test1 {
//	public static void main(String[] args) throws IOException, SaturnJobException {
////		org.junit.Assert.assertThat("",null);
//	}
//}
package com.vip.saturn.job.utils;

public class Test1{
	public static void main(String[] args)  throws Throwable  {
        com.vip.saturn.job.utils.HttpUtils.handleResponse(new org.apache.http.impl.client.CloseableHttpClient(null));
	}
}