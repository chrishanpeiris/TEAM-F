<?php
function get_setting( $key, $default = '' ) {
	$settings = $this->get_settings();
	
	// If legacy setting set, migrate settings
	if ( isset( $settings['wp-uploads'] ) && $settings['wp-uploads'] && in_array( $key, array( 'copy-to-s3', 'serve-from-s3' ) ) ) {
		return $default;
	}
	
	// Turn on object versioning by default
	if ( 'object-versioning' == $key && ! isset( $settings['object-versioning'] ) ) {
		return $default;
	}
	
	// Default object prefix
	if ( 'object-prefix' == $key && ! isset( $settings['object-prefix'] ) ) {
		return $this->get_default_object_prefix();
	}
	
	// Default use year and month folders
	if ( 'use-yearmonth-folders' == $key && ! isset( $settings['use-yearmonth-folders'] ) ) {
		return get_option( 'uploads_use_yearmonth_folders' );
	}
	$value = parent::get_setting( $key, $default );
	
	return apply_filters( 'as3cf_setting_' . $key, $value );
}