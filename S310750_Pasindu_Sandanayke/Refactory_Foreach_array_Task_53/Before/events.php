
$events = file_get_contents( 'https://someapi.com/events' );
$types = array();
foreach ( $events as $event ) {
    $types[] = $event->type;
}
$score = 0;
foreach ( $types as $type ) {
    switch ( $type ) {
        case 'type1':
            $score += 2;
            break;
        case 'type2':
            $score += 5;
            break;
        case 'type3':
            $score += 10;
            break;
        default:
            $score += 1;
            break;
    }
}