
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbDatePicker {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean readOnly = false;
    private Boolean required = false;
    private Boolean labelHidden = false;
    private String label = "Date";
    private PbDatePicker.LabelPosition labelPosition = PbDatePicker.LabelPosition.fromValue("top");
    private Double labelWidth = 4.0D;
    private String value;
    private String dateFormat = "MM/dd/yyyy";
    private String placeholder = "Enter a date (mm/dd/yyyy)";
    private Boolean showToday = true;
    private String todayLabel = "Today";

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
    public PbDatePicker.LabelPosition getLabelPosition() {
        return labelPosition;
    }

    /**
     * 
     * @param labelPosition
     *     The labelPosition
     */
    public void setLabelPosition(PbDatePicker.LabelPosition labelPosition) {
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

    /**
     * 
     * @return
     *     The dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * 
     * @param dateFormat
     *     The dateFormat
     */
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
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
     *     The showToday
     */
    public Boolean getShowToday() {
        return showToday;
    }

    /**
     * 
     * @param showToday
     *     The showToday
     */
    public void setShowToday(Boolean showToday) {
        this.showToday = showToday;
    }

    /**
     * 
     * @return
     *     The todayLabel
     */
    public String getTodayLabel() {
        return todayLabel;
    }

    /**
     * 
     * @param todayLabel
     *     The todayLabel
     */
    public void setTodayLabel(String todayLabel) {
        this.todayLabel = todayLabel;
    }

    public enum LabelPosition {

        LEFT("left"),
        TOP("top");
        private final String value;
        private final static Map<String, PbDatePicker.LabelPosition> CONSTANTS = new HashMap<String, PbDatePicker.LabelPosition>();

        static {
            for (PbDatePicker.LabelPosition c: values()) {
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

        public static PbDatePicker.LabelPosition fromValue(String value) {
            PbDatePicker.LabelPosition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
