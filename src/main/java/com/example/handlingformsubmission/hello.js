$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/buddyinfo"
    }).then(function(data) {
        $('.buddyInfo-name').append(data.name);
        $('.buddyInfo-phone').append(data.phoneNum);
    });
});