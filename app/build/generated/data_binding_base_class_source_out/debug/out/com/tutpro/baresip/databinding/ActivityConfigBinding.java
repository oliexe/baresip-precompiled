// Generated by view binder compiler. Do not edit!
package com.tutpro.baresip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tutpro.baresip.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConfigBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView AudioSettingsTitle;

  @NonNull
  public final CheckBox AutoStart;

  @NonNull
  public final TextView AutoStartTitle;

  @NonNull
  public final RelativeLayout Battery;

  @NonNull
  public final CheckBox BatteryOptimizations;

  @NonNull
  public final TextView BatteryOptimizationsTitle;

  @NonNull
  public final CheckBox CAFile;

  @NonNull
  public final TextView CAFileTitle;

  @NonNull
  public final CheckBox CertificateFile;

  @NonNull
  public final TextView CertificateFileTitle;

  @NonNull
  public final ScrollView ConfigView;

  @NonNull
  public final TextView ContactsTitle;

  @NonNull
  public final CheckBox DarkTheme;

  @NonNull
  public final TextView DarkThemeTitle;

  @NonNull
  public final CheckBox Debug;

  @NonNull
  public final TextView DebugTitle;

  @NonNull
  public final EditText DnsServers;

  @NonNull
  public final TextView DnsServersTitle;

  @NonNull
  public final EditText ListenAddress;

  @NonNull
  public final TextView ListenAddressTitle;

  @NonNull
  public final CheckBox Reset;

  @NonNull
  public final TextView ResetTitle;

  @NonNull
  public final CheckBox SipTrace;

  @NonNull
  public final TextView SipTraceTitle;

  @NonNull
  public final CheckBox VerifyServer;

  @NonNull
  public final TextView VerifyServerTitle;

  @NonNull
  public final Spinner contactsSpinner;

  private ActivityConfigBinding(@NonNull ScrollView rootView, @NonNull TextView AudioSettingsTitle,
      @NonNull CheckBox AutoStart, @NonNull TextView AutoStartTitle,
      @NonNull RelativeLayout Battery, @NonNull CheckBox BatteryOptimizations,
      @NonNull TextView BatteryOptimizationsTitle, @NonNull CheckBox CAFile,
      @NonNull TextView CAFileTitle, @NonNull CheckBox CertificateFile,
      @NonNull TextView CertificateFileTitle, @NonNull ScrollView ConfigView,
      @NonNull TextView ContactsTitle, @NonNull CheckBox DarkTheme,
      @NonNull TextView DarkThemeTitle, @NonNull CheckBox Debug, @NonNull TextView DebugTitle,
      @NonNull EditText DnsServers, @NonNull TextView DnsServersTitle,
      @NonNull EditText ListenAddress, @NonNull TextView ListenAddressTitle,
      @NonNull CheckBox Reset, @NonNull TextView ResetTitle, @NonNull CheckBox SipTrace,
      @NonNull TextView SipTraceTitle, @NonNull CheckBox VerifyServer,
      @NonNull TextView VerifyServerTitle, @NonNull Spinner contactsSpinner) {
    this.rootView = rootView;
    this.AudioSettingsTitle = AudioSettingsTitle;
    this.AutoStart = AutoStart;
    this.AutoStartTitle = AutoStartTitle;
    this.Battery = Battery;
    this.BatteryOptimizations = BatteryOptimizations;
    this.BatteryOptimizationsTitle = BatteryOptimizationsTitle;
    this.CAFile = CAFile;
    this.CAFileTitle = CAFileTitle;
    this.CertificateFile = CertificateFile;
    this.CertificateFileTitle = CertificateFileTitle;
    this.ConfigView = ConfigView;
    this.ContactsTitle = ContactsTitle;
    this.DarkTheme = DarkTheme;
    this.DarkThemeTitle = DarkThemeTitle;
    this.Debug = Debug;
    this.DebugTitle = DebugTitle;
    this.DnsServers = DnsServers;
    this.DnsServersTitle = DnsServersTitle;
    this.ListenAddress = ListenAddress;
    this.ListenAddressTitle = ListenAddressTitle;
    this.Reset = Reset;
    this.ResetTitle = ResetTitle;
    this.SipTrace = SipTrace;
    this.SipTraceTitle = SipTraceTitle;
    this.VerifyServer = VerifyServer;
    this.VerifyServerTitle = VerifyServerTitle;
    this.contactsSpinner = contactsSpinner;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConfigBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConfigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_config, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConfigBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AudioSettingsTitle;
      TextView AudioSettingsTitle = ViewBindings.findChildViewById(rootView, id);
      if (AudioSettingsTitle == null) {
        break missingId;
      }

      id = R.id.AutoStart;
      CheckBox AutoStart = ViewBindings.findChildViewById(rootView, id);
      if (AutoStart == null) {
        break missingId;
      }

      id = R.id.AutoStartTitle;
      TextView AutoStartTitle = ViewBindings.findChildViewById(rootView, id);
      if (AutoStartTitle == null) {
        break missingId;
      }

      id = R.id.Battery;
      RelativeLayout Battery = ViewBindings.findChildViewById(rootView, id);
      if (Battery == null) {
        break missingId;
      }

      id = R.id.BatteryOptimizations;
      CheckBox BatteryOptimizations = ViewBindings.findChildViewById(rootView, id);
      if (BatteryOptimizations == null) {
        break missingId;
      }

      id = R.id.BatteryOptimizationsTitle;
      TextView BatteryOptimizationsTitle = ViewBindings.findChildViewById(rootView, id);
      if (BatteryOptimizationsTitle == null) {
        break missingId;
      }

      id = R.id.CAFile;
      CheckBox CAFile = ViewBindings.findChildViewById(rootView, id);
      if (CAFile == null) {
        break missingId;
      }

      id = R.id.CAFileTitle;
      TextView CAFileTitle = ViewBindings.findChildViewById(rootView, id);
      if (CAFileTitle == null) {
        break missingId;
      }

      id = R.id.CertificateFile;
      CheckBox CertificateFile = ViewBindings.findChildViewById(rootView, id);
      if (CertificateFile == null) {
        break missingId;
      }

      id = R.id.CertificateFileTitle;
      TextView CertificateFileTitle = ViewBindings.findChildViewById(rootView, id);
      if (CertificateFileTitle == null) {
        break missingId;
      }

      ScrollView ConfigView = (ScrollView) rootView;

      id = R.id.ContactsTitle;
      TextView ContactsTitle = ViewBindings.findChildViewById(rootView, id);
      if (ContactsTitle == null) {
        break missingId;
      }

      id = R.id.DarkTheme;
      CheckBox DarkTheme = ViewBindings.findChildViewById(rootView, id);
      if (DarkTheme == null) {
        break missingId;
      }

      id = R.id.DarkThemeTitle;
      TextView DarkThemeTitle = ViewBindings.findChildViewById(rootView, id);
      if (DarkThemeTitle == null) {
        break missingId;
      }

      id = R.id.Debug;
      CheckBox Debug = ViewBindings.findChildViewById(rootView, id);
      if (Debug == null) {
        break missingId;
      }

      id = R.id.DebugTitle;
      TextView DebugTitle = ViewBindings.findChildViewById(rootView, id);
      if (DebugTitle == null) {
        break missingId;
      }

      id = R.id.DnsServers;
      EditText DnsServers = ViewBindings.findChildViewById(rootView, id);
      if (DnsServers == null) {
        break missingId;
      }

      id = R.id.DnsServersTitle;
      TextView DnsServersTitle = ViewBindings.findChildViewById(rootView, id);
      if (DnsServersTitle == null) {
        break missingId;
      }

      id = R.id.ListenAddress;
      EditText ListenAddress = ViewBindings.findChildViewById(rootView, id);
      if (ListenAddress == null) {
        break missingId;
      }

      id = R.id.ListenAddressTitle;
      TextView ListenAddressTitle = ViewBindings.findChildViewById(rootView, id);
      if (ListenAddressTitle == null) {
        break missingId;
      }

      id = R.id.Reset;
      CheckBox Reset = ViewBindings.findChildViewById(rootView, id);
      if (Reset == null) {
        break missingId;
      }

      id = R.id.ResetTitle;
      TextView ResetTitle = ViewBindings.findChildViewById(rootView, id);
      if (ResetTitle == null) {
        break missingId;
      }

      id = R.id.SipTrace;
      CheckBox SipTrace = ViewBindings.findChildViewById(rootView, id);
      if (SipTrace == null) {
        break missingId;
      }

      id = R.id.SipTraceTitle;
      TextView SipTraceTitle = ViewBindings.findChildViewById(rootView, id);
      if (SipTraceTitle == null) {
        break missingId;
      }

      id = R.id.VerifyServer;
      CheckBox VerifyServer = ViewBindings.findChildViewById(rootView, id);
      if (VerifyServer == null) {
        break missingId;
      }

      id = R.id.VerifyServerTitle;
      TextView VerifyServerTitle = ViewBindings.findChildViewById(rootView, id);
      if (VerifyServerTitle == null) {
        break missingId;
      }

      id = R.id.contactsSpinner;
      Spinner contactsSpinner = ViewBindings.findChildViewById(rootView, id);
      if (contactsSpinner == null) {
        break missingId;
      }

      return new ActivityConfigBinding((ScrollView) rootView, AudioSettingsTitle, AutoStart,
          AutoStartTitle, Battery, BatteryOptimizations, BatteryOptimizationsTitle, CAFile,
          CAFileTitle, CertificateFile, CertificateFileTitle, ConfigView, ContactsTitle, DarkTheme,
          DarkThemeTitle, Debug, DebugTitle, DnsServers, DnsServersTitle, ListenAddress,
          ListenAddressTitle, Reset, ResetTitle, SipTrace, SipTraceTitle, VerifyServer,
          VerifyServerTitle, contactsSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
