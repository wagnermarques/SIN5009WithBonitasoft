
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbLink {

    private String cssClasses;
    private Boolean hidden = false;
    private String text = "Link";
    private PbLink.Type type = PbLink.Type.fromValue("URL");
    private String targetUrl = "http://";
    private String pageToken;
    private String processName;
    private String processVersion;
    private String taskId;
    private String caseId;
    private PbLink.Target target = PbLink.Target.fromValue("_self");
    private String appToken;
    private String urlParams;
    private PbLink.Alignment alignment = PbLink.Alignment.fromValue("left");
    private PbLink.ButtonStyle buttonStyle = PbLink.ButtonStyle.fromValue("link");

    /**
     * 
     * @return
     *     The cssClasses
     */
    public String getCssClasses() {
        return cssClasses;
    }

    /**
     * 
     * @param cssClasses
     *     The cssClasses
     */
    public void setCssClasses(String cssClasses) {
        this.cssClasses = cssClasses;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The type
     */
    public PbLink.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(PbLink.Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The targetUrl
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * 
     * @param targetUrl
     *     The targetUrl
     */
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    /**
     * 
     * @return
     *     The pageToken
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * 
     * @param pageToken
     *     The pageToken
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * 
     * @return
     *     The processName
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * 
     * @param processName
     *     The processName
     */
    public void setProcessName(String processName) {
        this.processName = processName;
    }

    /**
     * 
     * @return
     *     The processVersion
     */
    public String getProcessVersion() {
        return processVersion;
    }

    /**
     * 
     * @param processVersion
     *     The processVersion
     */
    public void setProcessVersion(String processVersion) {
        this.processVersion = processVersion;
    }

    /**
     * 
     * @return
     *     The taskId
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 
     * @param taskId
     *     The taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * 
     * @return
     *     The caseId
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * 
     * @param caseId
     *     The caseId
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * 
     * @return
     *     The target
     */
    public PbLink.Target getTarget() {
        return target;
    }

    /**
     * 
     * @param target
     *     The target
     */
    public void setTarget(PbLink.Target target) {
        this.target = target;
    }

    /**
     * 
     * @return
     *     The appToken
     */
    public String getAppToken() {
        return appToken;
    }

    /**
     * 
     * @param appToken
     *     The appToken
     */
    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    /**
     * 
     * @return
     *     The urlParams
     */
    public String getUrlParams() {
        return urlParams;
    }

    /**
     * 
     * @param urlParams
     *     The urlParams
     */
    public void setUrlParams(String urlParams) {
        this.urlParams = urlParams;
    }

    /**
     * 
     * @return
     *     The alignment
     */
    public PbLink.Alignment getAlignment() {
        return alignment;
    }

    /**
     * 
     * @param alignment
     *     The alignment
     */
    public void setAlignment(PbLink.Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * 
     * @return
     *     The buttonStyle
     */
    public PbLink.ButtonStyle getButtonStyle() {
        return buttonStyle;
    }

    /**
     * 
     * @param buttonStyle
     *     The buttonStyle
     */
    public void setButtonStyle(PbLink.ButtonStyle buttonStyle) {
        this.buttonStyle = buttonStyle;
    }

    public enum Alignment {

        LEFT("left"),
        CENTER("center"),
        RIGHT("right");
        private final String value;
        private final static Map<String, PbLink.Alignment> CONSTANTS = new HashMap<String, PbLink.Alignment>();

        static {
            for (PbLink.Alignment c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Alignment(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbLink.Alignment fromValue(String value) {
            PbLink.Alignment constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ButtonStyle {

        LINK("link"),
        PRIMARY("primary"),
        SUCCESS("success"),
        INFO("info"),
        WARNING("warning"),
        DANGER("danger");
        private final String value;
        private final static Map<String, PbLink.ButtonStyle> CONSTANTS = new HashMap<String, PbLink.ButtonStyle>();

        static {
            for (PbLink.ButtonStyle c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ButtonStyle(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbLink.ButtonStyle fromValue(String value) {
            PbLink.ButtonStyle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Target {

        SELF("_self"),
        PARENT("_parent"),
        TOP("_top"),
        BLANK("_blank");
        private final String value;
        private final static Map<String, PbLink.Target> CONSTANTS = new HashMap<String, PbLink.Target>();

        static {
            for (PbLink.Target c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Target(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbLink.Target fromValue(String value) {
            PbLink.Target constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Type {

        PAGE("page"),
        TASK("task"),
        PROCESS("process"),
        OVERVIEW("overview"),
        URL("URL");
        private final String value;
        private final static Map<String, PbLink.Type> CONSTANTS = new HashMap<String, PbLink.Type>();

        static {
            for (PbLink.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbLink.Type fromValue(String value) {
            PbLink.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
