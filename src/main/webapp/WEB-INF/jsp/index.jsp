<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sagiri</title>
    <link href="https://sagirinoinu.top/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
    <script src="https://sagirinoinu.top/js/jquery-3.7.1.js"></script>
    <!-- 包括所有已编译的插件 -->
    <script src="https://sagirinoinu.top/js/bootstrap.min.js"></script>
    <style>
        body {
            background-image: url('https://sagirinoinu.top/img/sagiri2.png');
            background-size: cover; /* 使背景图像覆盖整个屏幕 */
            background-position: center; /* 使背景图像居中 */
            background-repeat: no-repeat; /* 避免图像重复 */
            margin: 0; /* 去除默认的边距 */
            padding: 0; /* 去除默认的内边距 */
            height: 100vh; /* 确保 body 高度为视口高度 */
            font-family: 'Arial', sans-serif; /* 更改字体 */
            color: #333; /* 设置默认字体颜色 */
        }
        /* 美化导航栏 */
        nav {
            background-color: rgba(0, 0, 255, 0.3); /* 半透明蓝色背景 */
            color: #fff;
            padding: 15px 30px;
            position: fixed;
            width: 100%;
            top: 0;
            left: 0;
            z-index: 1000; /* 确保导航栏在其他内容之上 */
            display: flex;
            align-items: center;
            justify-content: space-between; /* 左右对齐导航项和标题 */
        }
        nav a {
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            margin: 0 10px;
            border-radius: 5px; /* 添加圆角效果 */
            transition: background-color 0.3s; /* 添加过渡效果 */
        }
        nav a:hover {
            background-color: rgba(0, 0, 255, 0.5); /* 半透明蓝色背景 */
        }
        nav h1 {
            color: #fff; /* 确保标题文字颜色适合背景 */
            font-size: 1.5rem; /* 调整标题字体大小 */
            margin: 0; /* 去除默认的外边距 */
        }
        /* 页面内容 */
        .container {
            padding-top: 80px; /* 使内容不会被固定导航栏遮挡 */
            text-align: center; /* 居中对齐文本 */
        }
        .container h1 {
            font-size: 3rem;
            margin-bottom: 20px;
            color: #4b0082; /* 设置标题颜色 */
        }
        .container h3 {
            font-size: 1.5rem;
            color: #4b0082; /* 设置副标题颜色 */
        }
        /* 响应式设计 */
        @media (max-width: 768px) {
            nav {
                flex-direction: column; /* 在小屏幕上，导航栏内容纵向排列 */
                align-items: flex-start;
            }
            nav h1 {
                margin-bottom: 10px; /* 标题与导航链接之间的间距 */
            }
            nav a {
                display: block;
                margin: 5px 0;
            }
            .container {
                padding-top: 60px;
            }
        }
    </style>
</head>
<body>
<nav>
    <h1 class="text-center">Sagiri's Blog</h1>
    <div>
        <a href="/blog/index/index">首页</a>
        <a href="https://github.com/sagiri0512">仓库</a>
        <a href="/blog/myProject/myProject">项目</a>
    </div>
</nav>
<div class="container">
    <h1>Hi</h1>
    <h3>欢迎来到我的博客，这是使用Spring框架和Jsp开发的网站，数据传输使用Ajax</h3>
    <br/>
</div>
</body>
</html>
