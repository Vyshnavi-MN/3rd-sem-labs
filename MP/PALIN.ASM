.model small
   disp macro msg
     lea dx,msg
     mov ah,09h
     int 21h
     endm

.data
  msg1 db 0dh,0ah,"Enter the string: $"
  msg2 db 0dh,0ah,"Reversed string: $"
  msg3 db 0dh,0ah,"String is a palindrome$"
  msg4 db 0dh,0ah,"String is not a palindrome$"
  str db 10 dup(?)
  rev db 10 dup(?)

.code
  mov ax,@data
  mov ds,ax
  disp msg1
  mov si,00

  back: mov ah,01h
        int 21h
        cmp al,0dh
        je next
        mov str[si],al
        inc si
        jmp back

  next: mov cx,si
        mov di,cx
        mov si,00
        mov rev[di],'$'
        dec di

 back1: mov al,str[si]
        mov rev[di],al
        inc si
        dec di
        loop back1

        disp msg2
        disp rev
        mov cx,si
        mov si,00
        mov di,00

   l1: mov al,str[si]
       cmp rev[di],al
       jne fail
       inc si
       inc di
       loop l1
       disp msg3
       jmp last

   fail: disp msg4
   last: mov ah,4ch
         int 21h
         end
        
   
