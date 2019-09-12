
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbSelect {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean disabled = false;
    private Boolean required = false;
    private Boolean labelHidden = false;
    private String label = "Select";
    private PbSelect.LabelPosition labelPosition = PbSelect.LabelPosition.fromValue("top");
    private Double labelWidth = 4.0D;
    private String placeholder = "Select an option";
    private String availableValues;
    private String displayedKey;
    private String returnedKey;
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
     *     The disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 
     * @param disabled
     *     The disabled
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
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
    public PbSelect.LabelPosition getLabelPosition() {
        return labelPosition;
    }

    /**
     * 
     * @param labelPosition
     *     The labelPosition
     */
    public void setLabelPosition(PbSelect.LabelPosition labelPosition) {
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
     *     The availableValues
     */
    public String getAvailableValues() {
        return availableValues;
    }

    /**
     * 
     * @param availableValues
     *     The availableValues
     */
    public void setAvailableValues(String availableValues) {
        this.availableValues = availableValues;
    }

    /**
     * 
     * @return
     *     The displayedKey
     */
    public String getDisplayedKey() {
        return displayedKey;
    }

    /**
     * 
     * @param displayedKey
     *     The displayedKey
     */
    public void setDisplayedKey(String displayedKey) {
        this.displayedKey = displayedKey;
    }

    /**
     * 
     * @return
     *     The returnedKey
     */
    public String getReturnedKey() {
        return returnedKey;
    }

    /**
     * 
     * @param returnedKey
     *     The returnedKey
     */
    public void setReturnedKey(String returnedKey) {
        this.returnedKey = returnedKey;
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
        private final static Map<String, PbSelect.LabelPosition> CONSTANTS = new HashMap<String, PbSelect.LabelPosition>();

        static {
            for (PbSelect.LabelPosition c: values()) {
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

        public static PbSelect.LabelPosition fromValue(String value) {
            PbSelect.LabelPosition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
