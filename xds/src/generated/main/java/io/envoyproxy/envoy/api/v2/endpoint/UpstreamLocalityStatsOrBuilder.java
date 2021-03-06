// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/endpoint/load_report.proto

package io.envoyproxy.envoy.api.v2.endpoint;

public interface UpstreamLocalityStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.endpoint.UpstreamLocalityStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of zone, region and optionally endpoint group these metrics were
   * collected from. Zone and region names could be empty if unknown.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Locality locality = 1;</code>
   */
  boolean hasLocality();
  /**
   * <pre>
   * Name of zone, region and optionally endpoint group these metrics were
   * collected from. Zone and region names could be empty if unknown.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Locality locality = 1;</code>
   */
  io.envoyproxy.envoy.api.v2.core.Locality getLocality();
  /**
   * <pre>
   * Name of zone, region and optionally endpoint group these metrics were
   * collected from. Zone and region names could be empty if unknown.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Locality locality = 1;</code>
   */
  io.envoyproxy.envoy.api.v2.core.LocalityOrBuilder getLocalityOrBuilder();

  /**
   * <pre>
   * The total number of requests sent by this Envoy since the last report. This
   * information is aggregated over all the upstream Endpoints. total_requests
   * can be inferred from:
   * .. code-block:: none
   *   total_requests = total_successful_requests + total_requests_in_progress +
   *     total_error_requests
   * The total number of requests successfully completed by the endpoints in the
   * locality.
   * </pre>
   *
   * <code>uint64 total_successful_requests = 2;</code>
   */
  long getTotalSuccessfulRequests();

  /**
   * <pre>
   * The total number of unfinished requests
   * </pre>
   *
   * <code>uint64 total_requests_in_progress = 3;</code>
   */
  long getTotalRequestsInProgress();

  /**
   * <pre>
   * The total number of requests that failed due to errors at the endpoint,
   * aggregated over all endpoints in the locality.
   * </pre>
   *
   * <code>uint64 total_error_requests = 4;</code>
   */
  long getTotalErrorRequests();

  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.endpoint.EndpointLoadMetricStats> 
      getLoadMetricStatsList();
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  io.envoyproxy.envoy.api.v2.endpoint.EndpointLoadMetricStats getLoadMetricStats(int index);
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  int getLoadMetricStatsCount();
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.endpoint.EndpointLoadMetricStatsOrBuilder> 
      getLoadMetricStatsOrBuilderList();
  /**
   * <pre>
   * Stats for multi-dimensional load balancing.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.EndpointLoadMetricStats load_metric_stats = 5;</code>
   */
  io.envoyproxy.envoy.api.v2.endpoint.EndpointLoadMetricStatsOrBuilder getLoadMetricStatsOrBuilder(
      int index);

  /**
   * <pre>
   * Endpoint granularity stats information for this locality. This information
   * is populated if the Server requests it by setting
   * :ref:`LoadStatsResponse.report_endpoint_granularity&lt;envoy_api_field_load_stats.LoadStatsResponse.report_endpoint_granularity&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.UpstreamEndpointStats upstream_endpoint_stats = 7;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.endpoint.UpstreamEndpointStats> 
      getUpstreamEndpointStatsList();
  /**
   * <pre>
   * Endpoint granularity stats information for this locality. This information
   * is populated if the Server requests it by setting
   * :ref:`LoadStatsResponse.report_endpoint_granularity&lt;envoy_api_field_load_stats.LoadStatsResponse.report_endpoint_granularity&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.UpstreamEndpointStats upstream_endpoint_stats = 7;</code>
   */
  io.envoyproxy.envoy.api.v2.endpoint.UpstreamEndpointStats getUpstreamEndpointStats(int index);
  /**
   * <pre>
   * Endpoint granularity stats information for this locality. This information
   * is populated if the Server requests it by setting
   * :ref:`LoadStatsResponse.report_endpoint_granularity&lt;envoy_api_field_load_stats.LoadStatsResponse.report_endpoint_granularity&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.UpstreamEndpointStats upstream_endpoint_stats = 7;</code>
   */
  int getUpstreamEndpointStatsCount();
  /**
   * <pre>
   * Endpoint granularity stats information for this locality. This information
   * is populated if the Server requests it by setting
   * :ref:`LoadStatsResponse.report_endpoint_granularity&lt;envoy_api_field_load_stats.LoadStatsResponse.report_endpoint_granularity&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.UpstreamEndpointStats upstream_endpoint_stats = 7;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.endpoint.UpstreamEndpointStatsOrBuilder> 
      getUpstreamEndpointStatsOrBuilderList();
  /**
   * <pre>
   * Endpoint granularity stats information for this locality. This information
   * is populated if the Server requests it by setting
   * :ref:`LoadStatsResponse.report_endpoint_granularity&lt;envoy_api_field_load_stats.LoadStatsResponse.report_endpoint_granularity&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.endpoint.UpstreamEndpointStats upstream_endpoint_stats = 7;</code>
   */
  io.envoyproxy.envoy.api.v2.endpoint.UpstreamEndpointStatsOrBuilder getUpstreamEndpointStatsOrBuilder(
      int index);

  /**
   * <pre>
   * [#not-implemented-hide:] The priority of the endpoint group these metrics
   * were collected from.
   * </pre>
   *
   * <code>uint32 priority = 6;</code>
   */
  int getPriority();
}
