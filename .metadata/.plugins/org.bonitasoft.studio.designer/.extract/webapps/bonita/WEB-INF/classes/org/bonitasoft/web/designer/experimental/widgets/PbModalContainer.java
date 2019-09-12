
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbModalContainer {

    private String cssClasses;
    private Boolean hidden = false;
    private String modalId;
    private PbModalContainer.Size size;
    private Boolean animation = true;

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
     *     The modalId
     */
    public String getModalId() {
        return modalId;
    }

    /**
     * 
     * @param modalId
     *     The modalId
     */
    public void setModalId(String modalId) {
        this.modalId = modalId;
    }

    /**
     * 
     * @return
     *     The size
     */
    public PbModalContainer.Size getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(PbModalContainer.Size size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The animation
     */
    public Boolean getAnimation() {
        return animation;
    }

    /**
     * 
     * @param animation
     *     The animation
     */
    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    public enum Size {

        SM("sm"),
        __EMPTY__(""),
        LG("lg");
        private final String value;
        private final static Map<String, PbModalContainer.Size> CONSTANTS = new HashMap<String, PbModalContainer.Size>();

        static {
            for (PbModalContainer.Size c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Size(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbModalContainer.Size fromValue(String value) {
            PbModalContainer.Size constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
