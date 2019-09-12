
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbButton {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean disabled = false;
    private String label = "Submit";
    private PbButton.Alignment alignment = PbButton.Alignment.fromValue("left");
    private PbButton.ButtonStyle buttonStyle = PbButton.ButtonStyle.fromValue("default");
    private PbButton.Action action = PbButton.Action.fromValue("Submit task");
    private Boolean assign = false;
    private String url;
    private String responseStatusCode;
    private String dataToSend;
    private String dataFromSuccess;
    private Boolean closeOnSuccess = false;
    private String dataFromError;
    private String targetUrlOnSuccess;
    private String collectionToModify;
    private String modalId = "";
    private PbButton.CollectionPosition collectionPosition = PbButton.CollectionPosition.fromValue("Last");
    private String valueToAdd;
    private String removeItem;

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
     *     The alignment
     */
    public PbButton.Alignment getAlignment() {
        return alignment;
    }

    /**
     * 
     * @param alignment
     *     The alignment
     */
    public void setAlignment(PbButton.Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * 
     * @return
     *     The buttonStyle
     */
    public PbButton.ButtonStyle getButtonStyle() {
        return buttonStyle;
    }

    /**
     * 
     * @param buttonStyle
     *     The buttonStyle
     */
    public void setButtonStyle(PbButton.ButtonStyle buttonStyle) {
        this.buttonStyle = buttonStyle;
    }

    /**
     * 
     * @return
     *     The action
     */
    public PbButton.Action getAction() {
        return action;
    }

    /**
     * 
     * @param action
     *     The action
     */
    public void setAction(PbButton.Action action) {
        this.action = action;
    }

    /**
     * 
     * @return
     *     The assign
     */
    public Boolean getAssign() {
        return assign;
    }

    /**
     * 
     * @param assign
     *     The assign
     */
    public void setAssign(Boolean assign) {
        this.assign = assign;
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
     *     The responseStatusCode
     */
    public String getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * 
     * @param responseStatusCode
     *     The responseStatusCode
     */
    public void setResponseStatusCode(String responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * 
     * @return
     *     The dataToSend
     */
    public String getDataToSend() {
        return dataToSend;
    }

    /**
     * 
     * @param dataToSend
     *     The dataToSend
     */
    public void setDataToSend(String dataToSend) {
        this.dataToSend = dataToSend;
    }

    /**
     * 
     * @return
     *     The dataFromSuccess
     */
    public String getDataFromSuccess() {
        return dataFromSuccess;
    }

    /**
     * 
     * @param dataFromSuccess
     *     The dataFromSuccess
     */
    public void setDataFromSuccess(String dataFromSuccess) {
        this.dataFromSuccess = dataFromSuccess;
    }

    /**
     * 
     * @return
     *     The closeOnSuccess
     */
    public Boolean getCloseOnSuccess() {
        return closeOnSuccess;
    }

    /**
     * 
     * @param closeOnSuccess
     *     The closeOnSuccess
     */
    public void setCloseOnSuccess(Boolean closeOnSuccess) {
        this.closeOnSuccess = closeOnSuccess;
    }

    /**
     * 
     * @return
     *     The dataFromError
     */
    public String getDataFromError() {
        return dataFromError;
    }

    /**
     * 
     * @param dataFromError
     *     The dataFromError
     */
    public void setDataFromError(String dataFromError) {
        this.dataFromError = dataFromError;
    }

    /**
     * 
     * @return
     *     The targetUrlOnSuccess
     */
    public String getTargetUrlOnSuccess() {
        return targetUrlOnSuccess;
    }

    /**
     * 
     * @param targetUrlOnSuccess
     *     The targetUrlOnSuccess
     */
    public void setTargetUrlOnSuccess(String targetUrlOnSuccess) {
        this.targetUrlOnSuccess = targetUrlOnSuccess;
    }

    /**
     * 
     * @return
     *     The collectionToModify
     */
    public String getCollectionToModify() {
        return collectionToModify;
    }

    /**
     * 
     * @param collectionToModify
     *     The collectionToModify
     */
    public void setCollectionToModify(String collectionToModify) {
        this.collectionToModify = collectionToModify;
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
     *     The collectionPosition
     */
    public PbButton.CollectionPosition getCollectionPosition() {
        return collectionPosition;
    }

    /**
     * 
     * @param collectionPosition
     *     The collectionPosition
     */
    public void setCollectionPosition(PbButton.CollectionPosition collectionPosition) {
        this.collectionPosition = collectionPosition;
    }

    /**
     * 
     * @return
     *     The valueToAdd
     */
    public String getValueToAdd() {
        return valueToAdd;
    }

    /**
     * 
     * @param valueToAdd
     *     The valueToAdd
     */
    public void setValueToAdd(String valueToAdd) {
        this.valueToAdd = valueToAdd;
    }

    /**
     * 
     * @return
     *     The removeItem
     */
    public String getRemoveItem() {
        return removeItem;
    }

    /**
     * 
     * @param removeItem
     *     The removeItem
     */
    public void setRemoveItem(String removeItem) {
        this.removeItem = removeItem;
    }

    public enum Action {

        SUBMIT_TASK("Submit task"),
        START_PROCESS("Start process"),
        POST("POST"),
        PUT("PUT"),
        GET("GET"),
        DELETE("DELETE"),
        ADD_TO_COLLECTION("Add to collection"),
        REMOVE_FROM_COLLECTION("Remove from collection"),
        OPEN_MODAL("Open modal"),
        CLOSE_MODAL("Close modal");
        private final String value;
        private final static Map<String, PbButton.Action> CONSTANTS = new HashMap<String, PbButton.Action>();

        static {
            for (PbButton.Action c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Action(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbButton.Action fromValue(String value) {
            PbButton.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Alignment {

        LEFT("left"),
        CENTER("center"),
        RIGHT("right");
        private final String value;
        private final static Map<String, PbButton.Alignment> CONSTANTS = new HashMap<String, PbButton.Alignment>();

        static {
            for (PbButton.Alignment c: values()) {
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

        public static PbButton.Alignment fromValue(String value) {
            PbButton.Alignment constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ButtonStyle {

        DEFAULT("default"),
        PRIMARY("primary"),
        SUCCESS("success"),
        INFO("info"),
        WARNING("warning"),
        DANGER("danger"),
        LINK("link");
        private final String value;
        private final static Map<String, PbButton.ButtonStyle> CONSTANTS = new HashMap<String, PbButton.ButtonStyle>();

        static {
            for (PbButton.ButtonStyle c: values()) {
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

        public static PbButton.ButtonStyle fromValue(String value) {
            PbButton.ButtonStyle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CollectionPosition {

        FIRST("First"),
        ITEM("Item"),
        LAST("Last");
        private final String value;
        private final static Map<String, PbButton.CollectionPosition> CONSTANTS = new HashMap<String, PbButton.CollectionPosition>();

        static {
            for (PbButton.CollectionPosition c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CollectionPosition(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbButton.CollectionPosition fromValue(String value) {
            PbButton.CollectionPosition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
