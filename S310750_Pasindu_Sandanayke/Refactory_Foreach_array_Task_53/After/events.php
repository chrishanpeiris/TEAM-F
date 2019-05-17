<?php
$events = file_get_contents( 'https://someapi.com/events' );
$types = array_map( function( $event ) {
    return $event->type;
}, $events );
$scores = array(
    'type1' => 2,
    'type2' => 5,
    'type3' => 10,
);

//reduce function takes an array of values and reduces them to a single value
$score = array_reduce( $types, function( $result, $type ) use ( $scores ) {
    return $result += isset( $scores[$type] ) ? $scores[$type] : 1;
} );