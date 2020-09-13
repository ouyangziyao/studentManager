    var menuid = document.getElementById("menu1");
    this.type();
    function type()
    {
        var menuh2 = menuid.getElementsByTagName("h2");
        var menuul = menuid.getElementsByTagName("ul");
        menuh2[0].onmouseover = show;
        menuh2[0].onmouseout = unshow;
        menuul[0].onmouseover = show;
        menuul[0].onmouseout = unshow;
        function show()
        {
            menuul[0].className = "typeul block"
        }
        function unshow()
        {
            menuul[0].className = "typeul"
        }
    }