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

package com.aliyuncs.drds.model.v20150413;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyRdsReadWeightRequest extends RpcAcsRequest<ModifyRdsReadWeightResponse> {
	   

	private String weights;

	private String drdsInstanceId;

	private String instanceNames;

	private String dbName;
	public ModifyRdsReadWeightRequest() {
		super("Drds", "2015-04-13", "ModifyRdsReadWeight", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWeights() {
		return this.weights;
	}

	public void setWeights(String weights) {
		this.weights = weights;
		if(weights != null){
			putQueryParameter("Weights", weights);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getInstanceNames() {
		return this.instanceNames;
	}

	public void setInstanceNames(String instanceNames) {
		this.instanceNames = instanceNames;
		if(instanceNames != null){
			putQueryParameter("InstanceNames", instanceNames);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	@Override
	public Class<ModifyRdsReadWeightResponse> getResponseClass() {
		return ModifyRdsReadWeightResponse.class;
	}

}
