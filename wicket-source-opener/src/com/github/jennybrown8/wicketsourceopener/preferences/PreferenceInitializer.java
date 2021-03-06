package com.github.jennybrown8.wicketsourceopener.preferences;

import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.github.jennybrown8.wicketsourceopener.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {
	Logger log = Logger.getLogger("PreferenceInitializer");

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_PORT, 9123);
		store.setDefault(PreferenceConstants.P_PASSWORD, "");
		store.setDefault(PreferenceConstants.P_USEPASSWORD, false);
		store.setDefault(PreferenceConstants.P_KEEP_COUNT, 10);
		store.setDefault(PreferenceConstants.P_START_ON_STARTUP, true);
	}

}
