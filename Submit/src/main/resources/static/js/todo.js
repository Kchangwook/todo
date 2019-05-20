function detail(num) {
	location.href = '/todo/' + num;
}

function goUpdate(num) {
	if (confirm('수정 하시겠습니까?'))
		location.href = '/todo/revise/' + num;
}

function finish(num) {
	if (confirm('완료 처리 하시겠습니까?')) location.href='/finish/' + num;
}

function goHome() {
	location.href = '/';
}

function deletes(num) {
	if (confirm('삭제 하시겠습니까?'))
		location.href = '/delete/' + num;
}
