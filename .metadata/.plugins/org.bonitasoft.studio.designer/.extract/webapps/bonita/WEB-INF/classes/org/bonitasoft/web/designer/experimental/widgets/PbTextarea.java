
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbTextarea {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean readOnly = false;
    private Boolean required = false;
    private Double minLength;
    private Double maxLength;
    private Boolean labelHidden = false;
    private String label = "Default label";
    private PbTextarea.LabelPosition labelPosition = PbTextarea.LabelPosition.fromValue("top");
    private Double labelWidth = 4.0D;
    private String value;

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
     *     The readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * 
     * @param readOnly
     *     The readOnly
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * 
     * @return
     *     The required
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * 
     * @param required
     *     The required
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * 
     * @return
     *     The minLength
     */
    public Double getMinLength() {
        return minLength;
    }

    /**
     * 
     * @param minLength
     *     The minLength
     */
    public void setMinLength(Double minLength) {
        this.minLength = minLength;
    }

    /**
     * 
     * @return
     *     The maxLength
     */
    public Double getMaxLength() {
        return maxLength;
    }

    /**
     * 
     * @param maxLength
     *     The maxLength
     */
    public void setMaxLength(Double maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * 
     * @return
     *     The labelHidden
     */
    public Boolean getLabelHidden() {
        return labelHidden;
    }

    /**
     * 
     * @param labelHidden
     *     The labelHidden
     */
    public void setLabelHidden(Boolean labelHidden) {
        this.labelHidden = labelHidden;
    }

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The labelPosition
     */
    public PbTextarea.LabelPosition getLabelPosition() {
        return labelPosition;
    }

    /**
     * 
     * @param labelPosition
     *     The labelPosition
     */
    public void setLabelPosition(PbTextarea.LabelPosition labelPosition) {
        this.labelPosition = labelPosition;
    }

    /**
     * 
     * @return
     *     The labelWidth
     */
    public Double getLabelWidth() {
        return labelWidth;
    }

    /**
     * 
     * @param labelWidth
     *     The labelWidth
     */
    public void setLabelWidth(Double labelWidth) {
        this.labelWidth = labelWidth;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    public enum LabelPosition {

        LEFT("left"),
        TOP("top");
        private final String value;
        private final static Map<String, PbTextarea.LabelPosition> CONSTANTS = new HashMap<String, PbTextarea.LabelPosition>();

        static {
            for (PbTextarea.LabelPosition c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private LabelPosition(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbTextarea.LabelPosition fromValue(String value) {
            PbTextarea.LabelPosition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
