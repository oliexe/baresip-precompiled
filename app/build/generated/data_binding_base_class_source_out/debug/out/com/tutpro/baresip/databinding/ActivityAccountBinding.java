// Generated by view binder compiler. Do not edit!
package com.tutpro.baresip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tutpro.baresip.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAccountBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ScrollView AccountView;

  @NonNull
  public final TextView AnswerModeTitle;

  @NonNull
  public final TextView AudioCodecsTitle;

  @NonNull
  public final AppCompatEditText AuthPass;

  @NonNull
  public final TextView AuthPassTitle;

  @NonNull
  public final EditText AuthUser;

  @NonNull
  public final TextView AuthUserTitle;

  @NonNull
  public final CheckBox Default;

  @NonNull
  public final TextView DefaultTitle;

  @NonNull
  public final EditText DisplayName;

  @NonNull
  public final TextView DisplayNameTitle;

  @NonNull
  public final TextView DtmfModeTitle;

  @NonNull
  public final TextView MediaEncTitle;

  @NonNull
  public final TextView MediaNatTitle;

  @NonNull
  public final EditText Outbound1;

  @NonNull
  public final EditText Outbound2;

  @NonNull
  public final TextView OutboundProxyTitle;

  @NonNull
  public final TextView RegTitle;

  @NonNull
  public final CheckBox Register;

  @NonNull
  public final LinearLayout Stun;

  @NonNull
  public final AppCompatEditText StunPass;

  @NonNull
  public final TextView StunPassTitle;

  @NonNull
  public final EditText StunServer;

  @NonNull
  public final TextView StunServerTitle;

  @NonNull
  public final EditText StunUser;

  @NonNull
  public final TextView StunUserTitle;

  @NonNull
  public final TextView TelephonyProviderTitle;

  @NonNull
  public final TextView Uri;

  @NonNull
  public final TextView VoicemailUriTitle;

  @NonNull
  public final Spinner answerModeSpinner;

  @NonNull
  public final Spinner dtmfModeSpinner;

  @NonNull
  public final Spinner mediaEncSpinner;

  @NonNull
  public final Spinner mediaNatSpinner;

  @NonNull
  public final EditText telephonyProvider;

  @NonNull
  public final EditText voicemailUri;

  private ActivityAccountBinding(@NonNull ScrollView rootView, @NonNull ScrollView AccountView,
      @NonNull TextView AnswerModeTitle, @NonNull TextView AudioCodecsTitle,
      @NonNull AppCompatEditText AuthPass, @NonNull TextView AuthPassTitle,
      @NonNull EditText AuthUser, @NonNull TextView AuthUserTitle, @NonNull CheckBox Default,
      @NonNull TextView DefaultTitle, @NonNull EditText DisplayName,
      @NonNull TextView DisplayNameTitle, @NonNull TextView DtmfModeTitle,
      @NonNull TextView MediaEncTitle, @NonNull TextView MediaNatTitle, @NonNull EditText Outbound1,
      @NonNull EditText Outbound2, @NonNull TextView OutboundProxyTitle, @NonNull TextView RegTitle,
      @NonNull CheckBox Register, @NonNull LinearLayout Stun, @NonNull AppCompatEditText StunPass,
      @NonNull TextView StunPassTitle, @NonNull EditText StunServer,
      @NonNull TextView StunServerTitle, @NonNull EditText StunUser,
      @NonNull TextView StunUserTitle, @NonNull TextView TelephonyProviderTitle,
      @NonNull TextView Uri, @NonNull TextView VoicemailUriTitle,
      @NonNull Spinner answerModeSpinner, @NonNull Spinner dtmfModeSpinner,
      @NonNull Spinner mediaEncSpinner, @NonNull Spinner mediaNatSpinner,
      @NonNull EditText telephonyProvider, @NonNull EditText voicemailUri) {
    this.rootView = rootView;
    this.AccountView = AccountView;
    this.AnswerModeTitle = AnswerModeTitle;
    this.AudioCodecsTitle = AudioCodecsTitle;
    this.AuthPass = AuthPass;
    this.AuthPassTitle = AuthPassTitle;
    this.AuthUser = AuthUser;
    this.AuthUserTitle = AuthUserTitle;
    this.Default = Default;
    this.DefaultTitle = DefaultTitle;
    this.DisplayName = DisplayName;
    this.DisplayNameTitle = DisplayNameTitle;
    this.DtmfModeTitle = DtmfModeTitle;
    this.MediaEncTitle = MediaEncTitle;
    this.MediaNatTitle = MediaNatTitle;
    this.Outbound1 = Outbound1;
    this.Outbound2 = Outbound2;
    this.OutboundProxyTitle = OutboundProxyTitle;
    this.RegTitle = RegTitle;
    this.Register = Register;
    this.Stun = Stun;
    this.StunPass = StunPass;
    this.StunPassTitle = StunPassTitle;
    this.StunServer = StunServer;
    this.StunServerTitle = StunServerTitle;
    this.StunUser = StunUser;
    this.StunUserTitle = StunUserTitle;
    this.TelephonyProviderTitle = TelephonyProviderTitle;
    this.Uri = Uri;
    this.VoicemailUriTitle = VoicemailUriTitle;
    this.answerModeSpinner = answerModeSpinner;
    this.dtmfModeSpinner = dtmfModeSpinner;
    this.mediaEncSpinner = mediaEncSpinner;
    this.mediaNatSpinner = mediaNatSpinner;
    this.telephonyProvider = telephonyProvider;
    this.voicemailUri = voicemailUri;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ScrollView AccountView = (ScrollView) rootView;

      id = R.id.AnswerModeTitle;
      TextView AnswerModeTitle = ViewBindings.findChildViewById(rootView, id);
      if (AnswerModeTitle == null) {
        break missingId;
      }

      id = R.id.AudioCodecsTitle;
      TextView AudioCodecsTitle = ViewBindings.findChildViewById(rootView, id);
      if (AudioCodecsTitle == null) {
        break missingId;
      }

      id = R.id.AuthPass;
      AppCompatEditText AuthPass = ViewBindings.findChildViewById(rootView, id);
      if (AuthPass == null) {
        break missingId;
      }

      id = R.id.AuthPassTitle;
      TextView AuthPassTitle = ViewBindings.findChildViewById(rootView, id);
      if (AuthPassTitle == null) {
        break missingId;
      }

      id = R.id.AuthUser;
      EditText AuthUser = ViewBindings.findChildViewById(rootView, id);
      if (AuthUser == null) {
        break missingId;
      }

      id = R.id.AuthUserTitle;
      TextView AuthUserTitle = ViewBindings.findChildViewById(rootView, id);
      if (AuthUserTitle == null) {
        break missingId;
      }

      id = R.id.Default;
      CheckBox Default = ViewBindings.findChildViewById(rootView, id);
      if (Default == null) {
        break missingId;
      }

      id = R.id.DefaultTitle;
      TextView DefaultTitle = ViewBindings.findChildViewById(rootView, id);
      if (DefaultTitle == null) {
        break missingId;
      }

      id = R.id.DisplayName;
      EditText DisplayName = ViewBindings.findChildViewById(rootView, id);
      if (DisplayName == null) {
        break missingId;
      }

      id = R.id.DisplayNameTitle;
      TextView DisplayNameTitle = ViewBindings.findChildViewById(rootView, id);
      if (DisplayNameTitle == null) {
        break missingId;
      }

      id = R.id.DtmfModeTitle;
      TextView DtmfModeTitle = ViewBindings.findChildViewById(rootView, id);
      if (DtmfModeTitle == null) {
        break missingId;
      }

      id = R.id.MediaEncTitle;
      TextView MediaEncTitle = ViewBindings.findChildViewById(rootView, id);
      if (MediaEncTitle == null) {
        break missingId;
      }

      id = R.id.MediaNatTitle;
      TextView MediaNatTitle = ViewBindings.findChildViewById(rootView, id);
      if (MediaNatTitle == null) {
        break missingId;
      }

      id = R.id.Outbound1;
      EditText Outbound1 = ViewBindings.findChildViewById(rootView, id);
      if (Outbound1 == null) {
        break missingId;
      }

      id = R.id.Outbound2;
      EditText Outbound2 = ViewBindings.findChildViewById(rootView, id);
      if (Outbound2 == null) {
        break missingId;
      }

      id = R.id.OutboundProxyTitle;
      TextView OutboundProxyTitle = ViewBindings.findChildViewById(rootView, id);
      if (OutboundProxyTitle == null) {
        break missingId;
      }

      id = R.id.RegTitle;
      TextView RegTitle = ViewBindings.findChildViewById(rootView, id);
      if (RegTitle == null) {
        break missingId;
      }

      id = R.id.Register;
      CheckBox Register = ViewBindings.findChildViewById(rootView, id);
      if (Register == null) {
        break missingId;
      }

      id = R.id.Stun;
      LinearLayout Stun = ViewBindings.findChildViewById(rootView, id);
      if (Stun == null) {
        break missingId;
      }

      id = R.id.StunPass;
      AppCompatEditText StunPass = ViewBindings.findChildViewById(rootView, id);
      if (StunPass == null) {
        break missingId;
      }

      id = R.id.StunPassTitle;
      TextView StunPassTitle = ViewBindings.findChildViewById(rootView, id);
      if (StunPassTitle == null) {
        break missingId;
      }

      id = R.id.StunServer;
      EditText StunServer = ViewBindings.findChildViewById(rootView, id);
      if (StunServer == null) {
        break missingId;
      }

      id = R.id.StunServerTitle;
      TextView StunServerTitle = ViewBindings.findChildViewById(rootView, id);
      if (StunServerTitle == null) {
        break missingId;
      }

      id = R.id.StunUser;
      EditText StunUser = ViewBindings.findChildViewById(rootView, id);
      if (StunUser == null) {
        break missingId;
      }

      id = R.id.StunUserTitle;
      TextView StunUserTitle = ViewBindings.findChildViewById(rootView, id);
      if (StunUserTitle == null) {
        break missingId;
      }

      id = R.id.TelephonyProviderTitle;
      TextView TelephonyProviderTitle = ViewBindings.findChildViewById(rootView, id);
      if (TelephonyProviderTitle == null) {
        break missingId;
      }

      id = R.id.Uri;
      TextView Uri = ViewBindings.findChildViewById(rootView, id);
      if (Uri == null) {
        break missingId;
      }

      id = R.id.VoicemailUriTitle;
      TextView VoicemailUriTitle = ViewBindings.findChildViewById(rootView, id);
      if (VoicemailUriTitle == null) {
        break missingId;
      }

      id = R.id.answerModeSpinner;
      Spinner answerModeSpinner = ViewBindings.findChildViewById(rootView, id);
      if (answerModeSpinner == null) {
        break missingId;
      }

      id = R.id.dtmfModeSpinner;
      Spinner dtmfModeSpinner = ViewBindings.findChildViewById(rootView, id);
      if (dtmfModeSpinner == null) {
        break missingId;
      }

      id = R.id.mediaEncSpinner;
      Spinner mediaEncSpinner = ViewBindings.findChildViewById(rootView, id);
      if (mediaEncSpinner == null) {
        break missingId;
      }

      id = R.id.mediaNatSpinner;
      Spinner mediaNatSpinner = ViewBindings.findChildViewById(rootView, id);
      if (mediaNatSpinner == null) {
        break missingId;
      }

      id = R.id.telephonyProvider;
      EditText telephonyProvider = ViewBindings.findChildViewById(rootView, id);
      if (telephonyProvider == null) {
        break missingId;
      }

      id = R.id.voicemailUri;
      EditText voicemailUri = ViewBindings.findChildViewById(rootView, id);
      if (voicemailUri == null) {
        break missingId;
      }

      return new ActivityAccountBinding((ScrollView) rootView, AccountView, AnswerModeTitle,
          AudioCodecsTitle, AuthPass, AuthPassTitle, AuthUser, AuthUserTitle, Default, DefaultTitle,
          DisplayName, DisplayNameTitle, DtmfModeTitle, MediaEncTitle, MediaNatTitle, Outbound1,
          Outbound2, OutboundProxyTitle, RegTitle, Register, Stun, StunPass, StunPassTitle,
          StunServer, StunServerTitle, StunUser, StunUserTitle, TelephonyProviderTitle, Uri,
          VoicemailUriTitle, answerModeSpinner, dtmfModeSpinner, mediaEncSpinner, mediaNatSpinner,
          telephonyProvider, voicemailUri);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}