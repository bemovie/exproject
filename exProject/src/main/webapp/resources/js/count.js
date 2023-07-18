/**
 * 
 */

//숫자 카운트 애니메이션
$('.big').each(function () {
    const $this = $(this),
        countTo = $this.attr('data-count');

    $({
        countNum: $this.text()
    }).animate({
        countNum: countTo
    }, {
        duration: 3000,
        easing: 'linear',
        step: function () {
            $this.text(Math.floor(this.countNum));
        },
        complete: function () {
            $this.text(this.countNum);
        }
    });
});