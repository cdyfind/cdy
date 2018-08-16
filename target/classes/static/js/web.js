var socket = null;
//判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
    socket = new WebSocket("ws://127.0.0.1:8812/endpoint");
} else {
    alert('Not support socket')
}

//连接发生错误的回调方法
socket.onerror = function (e) {
    setMessageInnerHTML("error");
};

//连接成功建立的回调方法
socket.onopen = function () {
    setMessageInnerHTML("欢迎来到简易聊天室！");
}

//接收到消息的回调方法
socket.onmessage = function (event) {
    setMessageInnerHTML(event.data);
}

//连接关闭的回调方法
socket.onclose = function () {
    setMessageInnerHTML("close");
}

//监听窗口关闭事件，当窗口关闭时，主动去关闭socket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function () {
    socket.close();
}

//将消息显示在网页上
function setMessageInnerHTML (innerHTML) {
    var span = document.createElement('span');
    span.className = '_message';
    span.innerHTML = innerHTML;
    var content = document.getElementById("_window");
    content.appendChild(span);
    content.appendChild(document.createElement('br'));
}

//关闭连接
function closeWebSocket () {
    socket.close();
}

//发送消息
function send () {
    var target = document.getElementById('_text');
    var message = target.value;
    socket.send(message);
    target.value = '';
}

function enter() {
    if (event.keyCode == "13") {
        send();
    }
}