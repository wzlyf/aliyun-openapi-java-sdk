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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSchedulerconfigsreleasetaskResponseUnmarshaller {

	public static QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse unmarshall(QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse queryLinkefabricFabricSchedulerconfigsreleasetaskResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSchedulerconfigsreleasetaskResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.RequestId"));
		queryLinkefabricFabricSchedulerconfigsreleasetaskResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.ResultCode"));
		queryLinkefabricFabricSchedulerconfigsreleasetaskResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.ResultMessage"));
		queryLinkefabricFabricSchedulerconfigsreleasetaskResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.Message"));
		queryLinkefabricFabricSchedulerconfigsreleasetaskResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.ResponseStatusCode"));
		queryLinkefabricFabricSchedulerconfigsreleasetaskResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsreleasetaskResponse.Data["+ i +"]"));
		}
		queryLinkefabricFabricSchedulerconfigsreleasetaskResponse.setData(data);
	 
	 	return queryLinkefabricFabricSchedulerconfigsreleasetaskResponse;
	}
}