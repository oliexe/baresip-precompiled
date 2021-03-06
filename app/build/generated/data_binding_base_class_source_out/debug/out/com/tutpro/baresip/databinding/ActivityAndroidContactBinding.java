// Generated by view binder compiler. Do not edit!
package com.tutpro.baresip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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

public final class ActivityAndroidContactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView CardAvatar;

  @NonNull
  public final LinearLayout ContactView;

  @NonNull
  public final ImageView ImageAvatar;

  @NonNull
  public final TextView Name;

  @NonNull
  public final TextView TextAvatar;

  @NonNull
  public final ListView uris;

  private ActivityAndroidContactBinding(@NonNull LinearLayout rootView,
      @NonNull CardView CardAvatar, @NonNull LinearLayout ContactView,
      @NonNull ImageView ImageAvatar, @NonNull TextView Name, @NonNull TextView TextAvatar,
      @NonNull ListView uris) {
    this.rootView = rootView;
    this.CardAvatar = CardAvatar;
    this.ContactView = ContactView;
    this.ImageAvatar = ImageAvatar;
    this.Name = Name;
    this.TextAvatar = TextAvatar;
    this.uris = uris;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAndroidContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAndroidContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_android_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAndroidContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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
      TextView Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.TextAvatar;
      TextView TextAvatar = ViewBindings.findChildViewById(rootView, id);
      if (TextAvatar == null) {
        break missingId;
      }

      id = R.id.uris;
      ListView uris = ViewBindings.findChildViewById(rootView, id);
      if (uris == null) {
        break missingId;
      }

      return new ActivityAndroidContactBinding((LinearLayout) rootView, CardAvatar, ContactView,
          ImageAvatar, Name, TextAvatar, uris);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
