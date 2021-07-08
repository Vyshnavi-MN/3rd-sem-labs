.model small
.data
   n1 db 44d
   n2 db 08d

.code
  mov ax,@data
  mov ds,ax

  xor ax,ax
  mov al,n1
  mov bl,n2
  call gcd
  call disp

  mov ah,4ch
  int 21h

  gcd proc near
     div bl
     mov al,bl
     mov bl,ah
     cmp ah,00h
     je return
     xor ah,ah
     call gcd

     return: aam
             ret
      gcd endp

  disp proc near
     mov bx,ax
     mov ah,02h
     add bx,3030h
     mov dl,bh
     int 21h
     mov dl,bl
     int 21h
     ret
   disp endp
end
