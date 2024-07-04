// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: kessel/relations/v1beta1/lookup.proto

package org.project_kessel.api.relations.v1beta1;


/**
* Validates {@code LookupResourcesResponse} protobuf objects.
*/
@SuppressWarnings("all")
public class LookupResourcesResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<org.project_kessel.api.relations.v1beta1.LookupResourcesResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(org.project_kessel.api.relations.v1beta1.LookupResourcesResponse.class)) return new LookupResourcesResponseValidator();
		
		return null;
	}
		
	
		
	
	
	

	public void assertValid(org.project_kessel.api.relations.v1beta1.LookupResourcesResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			// Validate resource
			if (proto.hasResource()) index.validatorFor(proto.getResource()).assertValid(proto.getResource());
	
			// Validate pagination
			if (proto.hasPagination()) index.validatorFor(proto.getPagination()).assertValid(proto.getPagination());
	
	
	}

}

