// Generated by view binder compiler. Do not edit!
package com.tutpro.baresip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tutpro.baresip.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StatusNotificationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView etc;

  @NonNull
  public final ImageView image;

  @NonNull
  public final LinearLayout mainRow;

  @NonNull
  public final ImageView status0;

  @NonNull
  public final ImageView status1;

  @NonNull
  public final ImageView status2;

  @NonNull
  public final ImageView status3;

  @NonNull
  public final TextView text;

  private StatusNotificationBinding(@NonNull LinearLayout rootView, @NonNull TextView etc,
      @NonNull ImageView image, @NonNull LinearLayout mainRow, @NonNull ImageView status0,
      @NonNull ImageView status1, @NonNull ImageView status2, @NonNull ImageView status3,
      @NonNull TextView text) {
    this.rootView = rootView;
    this.etc = etc;
    this.image = image;
    this.mainRow = mainRow;
    this.status0 = status0;
    this.status1 = status1;
    this.status2 = status2;
    this.status3 = status3;
    this.text = text;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatusNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatusNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.status_notification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatusNotificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etc;
      TextView etc = ViewBindings.findChildViewById(rootView, id);
      if (etc == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      LinearLayout mainRow = (LinearLayout) rootView;

      id = R.id.status0;
      ImageView status0 = ViewBindings.findChildViewById(rootView, id);
      if (status0 == null) {
        break missingId;
      }

      id = R.id.status1;
      ImageView status1 = ViewBindings.findChildViewById(rootView, id);
      if (status1 == null) {
        break missingId;
      }

      id = R.id.status2;
      ImageView status2 = ViewBindings.findChildViewById(rootView, id);
      if (status2 == null) {
        break missingId;
      }

      id = R.id.status3;
      ImageView status3 = ViewBindings.findChildViewById(rootView, id);
      if (status3 == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      return new StatusNotificationBinding((LinearLayout) rootView, etc, image, mainRow, status0,
          status1, status2, status3, text);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
