/*
* Copyright (C) 2015 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

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