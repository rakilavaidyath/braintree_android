package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Nullable;

import com.cardinalcommerce.shared.userinterfaces.LabelCustomization;

/**
 * Label customization options for 3D Secure 2 flows.
 */
public class ThreeDSecureV2LabelCustomization extends ThreeDSecureV2BaseCustomization implements Parcelable {

    private String headingTextColor;
    private String headingTextFontName;
    private int headingTextFontSize;
    private String textFontName;
    private String textColor;
    private int textFontSize;
    private final LabelCustomization cardinalLabelCustomization = new LabelCustomization();

    public ThreeDSecureV2LabelCustomization() {
    }

    /**
     * @param textFontName Font type for the UI element.
     */
    public void setTextFontName(@Nullable String textFontName) {
        cardinalLabelCustomization.setTextFontName(textFontName);
    }

    /**
     * @param textColor Color code in Hex format. For example, the color code can be “#999999”.
     */
    public void setTextColor(@Nullable String textColor) {
        cardinalLabelCustomization.setTextColor(textColor);
    }

    /**
     * @param textFontSize Font size for the UI element.
     */
    public void setTextFontSize(int textFontSize) {
        cardinalLabelCustomization.setTextFontSize(textFontSize);
    }

    /**
     * @return Font type for the UI element.
     */
    @Nullable
    public String getTextFontName() {
        return textFontName;
    }

    /**
     * @return Color code in Hex format.
     */
    @Nullable
    public String getTextColor() {
        return textColor;
    }

    /**
     * @return Font size for the UI element.
     */
    public int getTextFontSize() {
        return textFontSize;
    }

    /**
     * @param headingTextColor Color code in Hex format. For example, the color code can be “#999999”.
     */
    public void setHeadingTextColor(@Nullable String headingTextColor) {
        this.headingTextColor = headingTextColor;
        cardinalLabelCustomization.setHeadingTextColor(headingTextColor);
    }

    /**
     * @param headingTextFontName Font type for the heading label text.
     */
    public void setHeadingTextFontName(@Nullable String headingTextFontName) {
        this.headingTextFontName = headingTextFontName;
        cardinalLabelCustomization.setHeadingTextFontName(headingTextFontName);
    }

    /**
     * @param headingTextFontSize Font size for the heading label text.
     */
    public void setHeadingTextFontSize(int headingTextFontSize) {
        this.headingTextFontSize = headingTextFontSize;
        cardinalLabelCustomization.setHeadingTextFontSize(headingTextFontSize);
    }

    /**
     * @return Color code in Hex format.
     */
    @Nullable
    public String getHeadingTextColor() {
        return headingTextColor;
    }

    /**
     * @return Font type for the heading label text.
     */
    @Nullable
    public String getHeadingTextFontName() {
        return headingTextFontName;
    }

    /**
     * @return Font size for the heading label text.
     */
    public int getHeadingTextFontSize() {
        return headingTextFontSize;
    }

    LabelCustomization getCardinalLabelCustomization() {
        return cardinalLabelCustomization;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    private ThreeDSecureV2LabelCustomization(Parcel in) {
        textFontName = in.readString();
        textColor = in.readString();
        textFontSize = in.readInt();
        headingTextColor = in.readString();
        headingTextFontName = in.readString();
        headingTextFontSize = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(textFontName);
        parcel.writeString(textColor);
        parcel.writeInt(textFontSize);
        parcel.writeString(headingTextColor);
        parcel.writeString(headingTextFontName);
        parcel.writeInt(headingTextFontSize);
    }

    public static final Creator<ThreeDSecureV2LabelCustomization> CREATOR = new Creator<ThreeDSecureV2LabelCustomization>() {
        @Override
        public ThreeDSecureV2LabelCustomization createFromParcel(Parcel in) {
            return new ThreeDSecureV2LabelCustomization(in);
        }

        @Override
        public ThreeDSecureV2LabelCustomization[] newArray(int size) {
            return new ThreeDSecureV2LabelCustomization[size];
        }
    };
}
