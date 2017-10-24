package edu.mit.mobile.android.appupdater;

import java.util.List;

import android.net.Uri;

public interface OnAppUpdateListener {
	public void appUpdateStatus(boolean isLatestVersion, String latestVersionName, List<String> changelog, Uri downloadUrl);
}