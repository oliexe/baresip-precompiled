// Generated by view binder compiler. Do not edit!
package com.tutpro.baresip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tutpro.baresip.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AccountSpinnerBinding implements ViewBinding {
  @NonNull
  private final TableLayout rootView;

  @NonNull
  public final ImageView spinnerImage;

  @NonNull
  public final TextView spinnerText;

  private AccountSpinnerBinding(@NonNull TableLayout rootView, @NonNull ImageView spinnerImage,
      @NonNull TextView spinnerText) {
    this.rootView = rootView;
    this.spinnerImage = spinnerImage;
    this.spinnerText = spinnerText;
  }

  @Override
  @NonNull
  public TableLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AccountSpinnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AccountSpinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.account_spinner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AccountSpinnerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.spinnerImage;
      ImageView spinnerImage = ViewBindings.findChildViewById(rootView, id);
      if (spinnerImage == null) {
        break missingId;
      }

      id = R.id.spinnerText;
      TextView spinnerText = ViewBindings.findChildViewById(rootView, id);
      if (spinnerText == null) {
        break missingId;
      }

      return new AccountSpinnerBinding((TableLayout) rootView, spinnerImage, spinnerText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}