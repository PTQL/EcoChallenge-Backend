package com.ecochallenges.config;



/*
@AllArgsConstructor
public class CustomAuthenticationFilter extends OncePerRequestFilter {

    private final UserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String email = request.getHeader("X-User-Email");

        if (email != null) {
            Optional<User> userOptional = userRepository.findOneByEmail(email);

            if (userOptional.isPresent()) {
                com.ecochallenges.model.entity.User user = userOptional.get(); // Asume que este es tu modelo User
                List<GrantedAuthority> authorities = List.of(
                        new SimpleGrantedAuthority("ROLE_" + user.getRole().name())
                );

                Authentication auth = new UsernamePasswordAuthenticationToken(
                        user.getEmail(),
                        null,
                        authorities
                );

                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }

        filterChain.doFilter(request, response);
    }
}

*/