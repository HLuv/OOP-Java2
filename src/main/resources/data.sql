INSERT INTO tickets (title, description, status, created_at, customer_name)
VALUES
    ('Printer is not working',
     'Printer in room 204 does not print documents.',
     'NEW', TIMESTAMP '2026-05-14 09:00:00', 'Ivan Ivanov'),

    ('No access to corporate email',
     'User cannot log into email after password change.',
     'IN_PROGRESS', TIMESTAMP '2026-05-14 09:30:00', 'Anna Petrova'),

    ('CRM does not open',
     'An error message appears when logging into CRM.',
     'NEW', TIMESTAMP '2026-05-14 10:15:00', 'Sergey Smirnov'),

    ('Replace cartridge',
     'Low toner level is displayed on the printer.',
     'RESOLVED', TIMESTAMP '2026-05-13 16:20:00', 'Maria Orlova'),

    ('VPN connection problem',
     'User cannot connect to the corporate VPN from home.',
     'NEW', TIMESTAMP '2026-05-14 11:40:00', 'Boris Britva'),

    ('Software installation completed',
     'Requested accounting software was successfully installed.',
     'RESOLVED', TIMESTAMP '2026-05-13 14:10:00', 'ALEX');
