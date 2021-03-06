
package de.uhh.l2g.webservices.videoprocessor.model.opencast;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Auto-generated by http://www.jsonschema2pojo.org/
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "identifier",
    "framecount",
    "framewidth",
    "framerate",
    "format",
    "bitrate",
    "frameheight"
})
public class Video1 {

    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("framecount")
    private Integer framecount;
    @JsonProperty("framewidth")
    private Integer framewidth;
    @JsonProperty("framerate")
    private Double framerate;
    @JsonProperty("format")
    private String format;
    @JsonProperty("bitrate")
    private Double bitrate;
    @JsonProperty("frameheight")
    private Integer frameheight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("framecount")
    public Integer getFramecount() {
        return framecount;
    }

    @JsonProperty("framecount")
    public void setFramecount(Integer framecount) {
        this.framecount = framecount;
    }

    @JsonProperty("framewidth")
    public Integer getFramewidth() {
        return framewidth;
    }

    @JsonProperty("framewidth")
    public void setFramewidth(Integer framewidth) {
        this.framewidth = framewidth;
    }

    @JsonProperty("framerate")
    public Double getFramerate() {
        return framerate;
    }

    @JsonProperty("framerate")
    public void setFramerate(Double framerate) {
        this.framerate = framerate;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("bitrate")
    public Double getBitrate() {
        return bitrate;
    }

    @JsonProperty("bitrate")
    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    @JsonProperty("frameheight")
    public Integer getFrameheight() {
        return frameheight;
    }

    @JsonProperty("frameheight")
    public void setFrameheight(Integer frameheight) {
        this.frameheight = frameheight;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
