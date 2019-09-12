
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbFileViewer {

    private String cssClasses;
    private Boolean hidden = false;
    private PbFileViewer.Type type = PbFileViewer.Type.fromValue("Process document");
    private String url = "";
    private String document = "";
    private Boolean showPreview = true;

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
     *     The type
     */
    public PbFileViewer.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(PbFileViewer.Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The document
     */
    public String getDocument() {
        return document;
    }

    /**
     * 
     * @param document
     *     The document
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * 
     * @return
     *     The showPreview
     */
    public Boolean getShowPreview() {
        return showPreview;
    }

    /**
     * 
     * @param showPreview
     *     The showPreview
     */
    public void setShowPreview(Boolean showPreview) {
        this.showPreview = showPreview;
    }

    public enum Type {

        PROCESS_DOCUMENT("Process document"),
        URL("URL");
        private final String value;
        private final static Map<String, PbFileViewer.Type> CONSTANTS = new HashMap<String, PbFileViewer.Type>();

        static {
            for (PbFileViewer.Type c: values()) {
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

        public static PbFileViewer.Type fromValue(String value) {
            PbFileViewer.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
