section .data
                 msg db "Hello World",0AH
                 msglen equ $-msg
section .bss
section .text
                 global _start
                 _start:
;display
                 MOV Rax,1
                 MOV Rdi, 1
                 MOV Rsi, msg
                 MOV Rdx,msglen
                 syscall
;Exit System call
                 mov Rax,60
                      mov Rdi,0
                 syscall                 
 
