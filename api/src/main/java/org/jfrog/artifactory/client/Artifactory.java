package org.jfrog.artifactory.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.MalformedURLException;

/**
 * @author jbaruch
 * @since 25/07/12
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Artifactory extends ApiInterface {

    String API_BASE = "/api";

    String getUri() throws MalformedURLException;

    String getContextName() throws MalformedURLException;

    String getUsername();

    String getUserAgent();

    Repositories repositories();

    RepositoryHandle repository(String repo);

    Searches searches();

    Security security();

    Storage storage();

    Plugins plugins();

    ArtifactorySystem system();

    ArtifactoryResponse restCall(ArtifactoryRequest artifactoryRequest) throws Exception;

    void close();
}
