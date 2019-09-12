
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbInput {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean required = false;
    private Double minLength;
    private Double maxLength;
    private Boolean readOnly = false;
    private Boolean labelHidden = false;
    private String label = "Default label";
    private PbInput.LabelPosition labelPosition = PbInput.LabelPosition.fromValue("top");
    private Double labelWidth = 4.0D;
    private String placeholder;
    private String value;
    private PbInput.Type type = PbInput.Type.fromValue("text");
    private Double min;
    private Double max;
    private Double step = 1.0D;

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
    public PbInput.LabelPosition getLabelPosition() {
        return labelPosition;
    }

    /**
     * 
     * @param labelPosition
     *     The labelPosition
     */
    public void setLabelPosition(PbInput.LabelPosition labelPosition) {
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
     *     The placeholder
     */
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * 
     * @param placeholder
     *     The placeholder
     */
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
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

    /**
     * 
     * @return
     *     The type
     */
    public PbInput.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(PbInput.Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The min
     */
    public Double getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * 
     * @return
     *     The max
     */
    public Double getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * 
     * @return
     *     The step
     */
    public Double getStep() {
        return step;
    }

    /**
     * 
     * @param step
     *     The step
     */
    public void setStep(Double step) {
        this.step = step;
    }

    public enum LabelPosition {

        LEFT("left"),
        TOP("top");
        private final String value;
        private final static Map<String, PbInput.LabelPosition> CONSTANTS = new HashMap<String, PbInput.LabelPosition>();

        static {
            for (PbInput.LabelPosition c: values()) {
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

        public static PbInput.LabelPosition fromValue(String value) {
            PbInput.LabelPosition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Type {

        TEXT("text"),
        NUMBER("number"),
        EMAIL("email"),
        PASSWORD("password");
        private final String value;
        private final static Map<String, PbInput.Type> CONSTANTS = new HashMap<String, PbInput.Type>();

        static {
            for (PbInput.Type c: values()) {
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

        public static PbInput.Type fromValue(String value) {
            PbInput.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
