grammar GarciaGuerra;

texto: (HASHTAG | USR | LINK | TEXT | WS)+ ;

HASHTAG: '#' [a-zA-Z0-9_]+ {System.out.print("<span class='hashtag'>" + getText() + "</span> " ); };
USR: '@' [a-zA-Z0-9_]+ {System.out.print("<span class='usr'>" + getText() + "</span> " ); };
LINK: ('http://' | 'https://') [a-zA-Z0-9,./]+ {System.out.print("<span class='link'>" + getText() + "</span> " ); };
TEXT: ~[#@\n\r\t ]+ {System.out.print(getText()+" ");};
WS: [ \t\r\n]+ ;
