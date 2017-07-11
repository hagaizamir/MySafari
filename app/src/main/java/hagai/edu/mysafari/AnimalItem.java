package hagai.edu.mysafari;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Hagai Zamir on 11-Jul-17.
 */

public class AnimalItem implements Parcelable {
    private final String title;
    private final  String type;
    private final int thumbnailResId;
    private final  String text;

    public AnimalItem(String title, String type, int thumbnailResId, String text) {
        this.title = title;
        this.type = type;
        this.thumbnailResId = thumbnailResId;
        this.text = text;
    }

    protected AnimalItem(Parcel in) {
        title = in.readString();
        type = in.readString();
        thumbnailResId = in.readInt();
        text = in.readString();
    }

    public static final Creator<AnimalItem> CREATOR = new Creator<AnimalItem>() {
        @Override
        public AnimalItem createFromParcel(Parcel in) {
            return new AnimalItem(in);
        }

        @Override
        public AnimalItem[] newArray(int size) {
            return new AnimalItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(type);
        parcel.writeInt(thumbnailResId);
        parcel.writeString(text);
    }
}
