// Generated by view binder compiler. Do not edit!
package com.tutpro.baresip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tutpro.baresip.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox Android;

  @NonNull
  public final TextView AndroidTitle;

  @NonNull
  public final CardView CardAvatar;

  @NonNull
  public final LinearLayout ContactView;

  @NonNull
  public final ImageView ImageAvatar;

  @NonNull
  public final EditText Name;

  @NonNull
  public final TextView NameTitle;

  @NonNull
  public final TextView SipOrTelUriTitle;

  @NonNull
  public final TextView TextAvatar;

  @NonNull
  public final EditText Uri;

  private ActivityContactBinding(@NonNull LinearLayout rootView, @NonNull CheckBox Android,
      @NonNull TextView AndroidTitle, @NonNull CardView CardAvatar,
      @NonNull LinearLayout ContactView, @NonNull ImageView ImageAvatar, @NonNull EditText Name,
      @NonNull TextView NameTitle, @NonNull TextView SipOrTelUriTitle, @NonNull TextView TextAvatar,
      @NonNull EditText Uri) {
    this.rootView = rootView;
    this.Android = Android;
    this.AndroidTitle = AndroidTitle;
    this.CardAvatar = CardAvatar;
    this.ContactView = ContactView;
    this.ImageAvatar = ImageAvatar;
    this.Name = Name;
    this.NameTitle = NameTitle;
    this.SipOrTelUriTitle = SipOrTelUriTitle;
    this.TextAvatar = TextAvatar;
    this.Uri = Uri;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Android;
      CheckBox Android = ViewBindings.findChildViewById(rootView, id);
      if (Android == null) {
        break missingId;
      }

      id = R.id.AndroidTitle;
      TextView AndroidTitle = ViewBindings.findChildViewById(rootView, id);
      if (AndroidTitle == null) {
        break missingId;
      }

      id = R.id.CardAvatar;
      CardView CardAvatar = ViewBindings.findChildViewById(rootView, id);
      if (CardAvatar == null) {
        break missingId;
      }

      LinearLayout ContactView = (LinearLayout) rootView;

      id = R.id.ImageAvatar;
      ImageView ImageAvatar = ViewBindings.findChildViewById(rootView, id);
      if (ImageAvatar == null) {
        break missingId;
      }

      id = R.id.Name;
      EditText Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.NameTitle;
      TextView NameTitle = ViewBindings.findChildViewById(rootView, id);
      if (NameTitle == null) {
        break missingId;
      }

      id = R.id.SipOrTelUriTitle;
      TextView SipOrTelUriTitle = ViewBindings.findChildViewById(rootView, id);
      if (SipOrTelUriTitle == null) {
        break missingId;
      }

      id = R.id.TextAvatar;
      TextView TextAvatar = ViewBindings.findChildViewById(rootView, id);
      if (TextAvatar == null) {
        break missingId;
      }

      id = R.id.Uri;
      EditText Uri = ViewBindings.findChildViewById(rootView, id);
      if (Uri == null) {
        break missingId;
      }

      return new ActivityContactBinding((LinearLayout) rootView, Android, AndroidTitle, CardAvatar,
          ContactView, ImageAvatar, Name, NameTitle, SipOrTelUriTitle, TextAvatar, Uri);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
