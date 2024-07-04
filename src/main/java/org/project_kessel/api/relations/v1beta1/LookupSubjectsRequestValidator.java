// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: kessel/relations/v1beta1/lookup.proto

package org.project_kessel.api.relations.v1beta1;


/**
* Validates {@code LookupSubjectsRequest} protobuf objects.
*/
@SuppressWarnings("all")
public class LookupSubjectsRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<org.project_kessel.api.relations.v1beta1.LookupSubjectsRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(org.project_kessel.api.relations.v1beta1.LookupSubjectsRequest.class)) return new LookupSubjectsRequestValidator();
		
		return null;
	}
		
	
		
	
		
	
	
		
	
		
	
	

	public void assertValid(org.project_kessel.api.relations.v1beta1.LookupSubjectsRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
		if (proto.hasResource()) {
			io.envoyproxy.pgv.RequiredValidation.required(".kessel.relations.v1beta1.LookupSubjectsRequest.resource", proto.getResource());
		} else {
			io.envoyproxy.pgv.RequiredValidation.required(".kessel.relations.v1beta1.LookupSubjectsRequest.resource", null);
		};
	
			io.envoyproxy.pgv.StringValidation.minLength(".kessel.relations.v1beta1.LookupSubjectsRequest.relation", proto.getRelation(), 1);
	
		if (proto.hasSubjectType()) {
			io.envoyproxy.pgv.RequiredValidation.required(".kessel.relations.v1beta1.LookupSubjectsRequest.subject_type", proto.getSubjectType());
		} else {
			io.envoyproxy.pgv.RequiredValidation.required(".kessel.relations.v1beta1.LookupSubjectsRequest.subject_type", null);
		};
	
		if (proto.hasSubjectRelation()) {
			// no validation rules for SubjectRelation

		}
	
		if (proto.hasPagination()) {
			
			// Validate pagination
			if (proto.hasPagination()) index.validatorFor(proto.getPagination()).assertValid(proto.getPagination());
		}
	
	
	}

}

