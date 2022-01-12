UserDetailsService ve PasswordEncoderi ayrica bean kimi override etmekdense

@Override
protected void configure(AuthenticationManagerBuilder auth){
    auth.userDetailsService().passwordEncoder();
} 

metodunu override etdik