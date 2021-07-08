.model small
.data
  msg1 db 0dh,0ah,"enter alphanumeric: $"
  res db 02 dup(0)   ;create array

.code
  mov ax,@data
  mov ds,ax

  lea dx,msg1
  call disp
  mov ah,01h     ;take 1 letter input
  int 21h

  mov bl,al
  mov cl,4
  shr al,cl
  cmp al,0ah
  jc digit
  add al,07h

digit: add al,30h
       mov res,al
       and bl,0fh
       cmp bl,0ah
       jc digit1
       add bl,07h

digit1: add bl,30h
        mov res+1,bl

        mov ah,00h
        mov al,03h   ; to create output screen
        int 10h

        mov ah,02h
        mov bh,00h     ;to access cursor in the left corner
        mov dh,0ch
        mov dl,28h    ;to move cursor to center
        int 10h

        mov res+2,'$'
        lea dx,res
        call disp
        mov ah,4ch
        int 21h

disp proc near      ;near-for within segment
        mov ah,09h
        int 21h
        ret
        disp endp
        end

