package de.codecentric.android.timer.activity;

enum RequestCode {
	PREFERENCES(1), MANAGE_FAVORITES(2), SAVE_FAVORITE(3);

	final int code;

	RequestCode(int code) {
		this.code = code;
	}
}
