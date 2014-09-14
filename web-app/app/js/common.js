$(document).ready(function () {
    // chicken and egg switcher
    $(document).on('click', '.dropdown-toggle', function() {
        $(this).parent('li').addClass('open');
    });

    $(".chicken-btn").click(function() {
        $( ".egg" ).hide( "normal", function() {
            $(".chicken").fadeIn();
        });
        $(".egg-btn").removeClass('active');
        $(".chicken-btn").addClass('active');
    });
    $(".egg-btn").click(function() {
        $( ".chicken" ).hide( "normal", function() {
            $(".egg").fadeIn();
        });
        $(".chicken-btn").removeClass('active');
        $(".egg-btn").addClass('active');
    });

    $('.sub-menu a[href]').click(function(){
        var href = $(this).attr('href');
        if ( href.indexOf('#') !== -1 ){
            tagID = href.substr(href.indexOf('#'));
            if ( $(tagID).length ) {
                var scrollDistance = $('#header').outerHeight() + 18;
                var newScrollTop = ( $(tagID).offset().top) - scrollDistance;
                $("html, body").animate({ scrollTop: newScrollTop + 'px' }, 300, 'swing');
            }
            return false;
        }
    });
    $('[data-classtoggle]').click(function (){
        $($(this).attr('data-classtoggle')).removeClass('active');
        $(this).addClass('active');
    });
    $('[data-customtoggle]').click(function () {
        $('[data-customtoggle]').removeClass('active');
        $(this).addClass('active');
        $($(this).attr('data-customtoggle')).hide();
        $($(this).attr('data-customtoggle-open')).stop().show();
    });
    $('[data-filler]').click(function () {
        var objElements = $.parseJSON( $(this).attr('data-filler') );
        for ( var objElementKey in objElements ) {
            var objElement = objElements[objElementKey];
            for ( var objectDataKey in objElement ) {
                var objectData = objElement[objectDataKey];
                if ( objectDataKey == 'css' ) {
                    for ( var cssDataKey in objectData ) {
                        var cssData = objectData[cssDataKey];
                        $(objElementKey).css(cssDataKey, cssData);
                    }
                } else {
                    $(objElementKey).attr(objectDataKey, objectData);
                }
            }
        }
        return false;
    });
});