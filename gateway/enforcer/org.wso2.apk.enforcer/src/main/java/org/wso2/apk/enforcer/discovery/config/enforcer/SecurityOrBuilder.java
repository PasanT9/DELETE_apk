// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/security.proto

package org.wso2.apk.enforcer.discovery.config.enforcer;

public interface SecurityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.Security)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.wso2.discovery.config.enforcer.APIKeyEnforcer apiKey = 1;</code>
   * @return Whether the apiKey field is set.
   */
  boolean hasApiKey();
  /**
   * <code>.wso2.discovery.config.enforcer.APIKeyEnforcer apiKey = 1;</code>
   * @return The apiKey.
   */
  org.wso2.apk.enforcer.discovery.config.enforcer.APIKeyEnforcer getApiKey();
  /**
   * <code>.wso2.discovery.config.enforcer.APIKeyEnforcer apiKey = 1;</code>
   */
  org.wso2.apk.enforcer.discovery.config.enforcer.APIKeyEnforcerOrBuilder getApiKeyOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.APIKeyEnforcer runtimeToken = 2;</code>
   * @return Whether the runtimeToken field is set.
   */
  boolean hasRuntimeToken();
  /**
   * <code>.wso2.discovery.config.enforcer.APIKeyEnforcer runtimeToken = 2;</code>
   * @return The runtimeToken.
   */
  org.wso2.apk.enforcer.discovery.config.enforcer.APIKeyEnforcer getRuntimeToken();
  /**
   * <code>.wso2.discovery.config.enforcer.APIKeyEnforcer runtimeToken = 2;</code>
   */
  org.wso2.apk.enforcer.discovery.config.enforcer.APIKeyEnforcerOrBuilder getRuntimeTokenOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.MutualSSL mutualSSL = 4;</code>
   * @return Whether the mutualSSL field is set.
   */
  boolean hasMutualSSL();
  /**
   * <code>.wso2.discovery.config.enforcer.MutualSSL mutualSSL = 4;</code>
   * @return The mutualSSL.
   */
  org.wso2.apk.enforcer.discovery.config.enforcer.MutualSSL getMutualSSL();
  /**
   * <code>.wso2.discovery.config.enforcer.MutualSSL mutualSSL = 4;</code>
   */
  org.wso2.apk.enforcer.discovery.config.enforcer.MutualSSLOrBuilder getMutualSSLOrBuilder();
}