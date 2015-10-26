package be.nabu.glue.transcoder;

import java.io.IOException;

import be.nabu.libs.evaluator.annotations.MethodProviderClass;
import be.nabu.utils.codec.TranscoderUtils;
import be.nabu.utils.codec.impl.Base64Encoder;
import be.nabu.utils.io.IOUtils;
import be.nabu.utils.io.api.ByteBuffer;

@MethodProviderClass(namespace = "transcoder")
public class TranscoderMethods {
	public static String base64Encode(byte [] content) throws IOException {
		ByteBuffer wrap = IOUtils.wrap(content, true);
		wrap.close();
		return new String(IOUtils.toBytes(TranscoderUtils.transcodeBytes(wrap, new Base64Encoder())));
	}
}