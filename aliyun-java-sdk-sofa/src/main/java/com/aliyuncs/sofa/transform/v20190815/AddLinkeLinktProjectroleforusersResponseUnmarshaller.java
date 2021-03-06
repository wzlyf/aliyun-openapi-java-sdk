/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktProjectroleforusersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinktProjectroleforusersResponseUnmarshaller {

	public static AddLinkeLinktProjectroleforusersResponse unmarshall(AddLinkeLinktProjectroleforusersResponse addLinkeLinktProjectroleforusersResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinktProjectroleforusersResponse.setRequestId(_ctx.stringValue("AddLinkeLinktProjectroleforusersResponse.RequestId"));
		addLinkeLinktProjectroleforusersResponse.setResultCode(_ctx.stringValue("AddLinkeLinktProjectroleforusersResponse.ResultCode"));
		addLinkeLinktProjectroleforusersResponse.setResultMessage(_ctx.stringValue("AddLinkeLinktProjectroleforusersResponse.ResultMessage"));
		addLinkeLinktProjectroleforusersResponse.setData(_ctx.booleanValue("AddLinkeLinktProjectroleforusersResponse.Data"));
		addLinkeLinktProjectroleforusersResponse.setErrorCode(_ctx.longValue("AddLinkeLinktProjectroleforusersResponse.ErrorCode"));
		addLinkeLinktProjectroleforusersResponse.setErrorMessage(_ctx.stringValue("AddLinkeLinktProjectroleforusersResponse.ErrorMessage"));
		addLinkeLinktProjectroleforusersResponse.setResponseStatusCode(_ctx.longValue("AddLinkeLinktProjectroleforusersResponse.ResponseStatusCode"));
		addLinkeLinktProjectroleforusersResponse.setSuccess(_ctx.booleanValue("AddLinkeLinktProjectroleforusersResponse.Success"));
	 
	 	return addLinkeLinktProjectroleforusersResponse;
	}
}