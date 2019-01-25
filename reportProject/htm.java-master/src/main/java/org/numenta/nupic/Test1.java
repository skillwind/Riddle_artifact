//package org.numenta.nupic;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//
//import org.nustaq.serialization.FSTConfiguration;
//import org.nustaq.serialization.FSTObjectInput;
//
//public class Test1 {
//	public static void main(String[] args) throws IOException, Exception {
//		Parameters.getAllDefaultParameters().readForNetwork(FSTObjectInput());
//	}
//
//	public static FSTObjectInput FSTObjectInput() throws IOException, Exception {
//		FSTObjectInput fSTObjectInput = new org.nustaq.serialization.FSTObjectInput(new ByteArrayInputStream("{ ".getBytes()),
//				FSTConfiguration());
//		return fSTObjectInput;
//	}
//
//	public static FSTConfiguration FSTConfiguration() {
//		FSTConfiguration conf = FSTConfiguration.createJsonConfiguration(false, false);
//		return conf;
//	}
//}

